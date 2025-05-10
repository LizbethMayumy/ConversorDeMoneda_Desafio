import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaTasaDeCambio {

    public TasaDeCambio buscatasaDeCambio(String monedaBase) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/2f37da67ec4204d7b38ce2da/latest/" + monedaBase);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), TasaDeCambio.class);

        } catch (Exception e) {
            throw new RuntimeException("No se pudo obtener el tipo de cambio.");
        }
    }

    public double convertir(double valor, String monedaBase, String monedaDestino) {
        TasaDeCambio tasa = buscatasaDeCambio(monedaBase);
        double tasaConversion=tasa.conversion_rates().get(monedaDestino);
        return valor * tasaConversion;
    }
}
