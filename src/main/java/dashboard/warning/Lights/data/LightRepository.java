package dashboard.warning.Lights.data;

import dashboard.warning.Lights.model.Light;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class LightRepository {
    private static final List<Light> All_LIGHTS = Arrays.asList(
            new Light("Niezapięty Pas Bezpieczeństwa", "belt", "żółty", "Lampka przypominająca o zapęciu pasa bezpieczeństwa"),
            new Light("Lampka ostrzegawcza układu hamulcowego", "brake", "czerwony", "Niski poziom pyłnu w układzie hamulcowym lub usterk ́w układzie hamulcowym, lampka ta świeci się również, gdy hamulec postojowy nie jest zwolniony. Jeśli po całkowitym zwolnieniu hamulca postojowego lampka zgaśnie, układ jest sprawny."),
            new Light("Lampka ostrzegawcza ciśnienia w ogumieniu", "tire", "żółty", "Lampka ostrzegawcza ciśnienia w ogumieniu, gdy lampka ostrzegawcza świeci się w sposób ciągły sygnalizuje spadek ciśnienia w ogumieniu"),
            new Light("Maska otwarta", "hood", "zielony", "Maska samochodu pozostaje otwarta"),
            new Light("Bagażnik otwarty", "trunk", "zielony", "Bagażnik samochodu pozostaje otwarty"),
            new Light("Niski poziom paliwa", "low", "zielony/zółty/czerwony", "Sygnalizuje, że paliwo w zbiorniku się kończy"),
            new Light("Lampka ostrzegawcza układu poduszek powietrznych", "airbagdeactivated", "żółty", "Sygnalizuje usterkę układu poduszek powietrznych"),
            new Light("Lampka ostrzegawcza wyłączonego układu poduszek powietrznych", "airbagwarning", "żółty", "Sygnalizuje wyłączenie układu poduszek powietrznych"),
            new Light("Lampka ostrzegawcza ładowania akumulatora", "battery", "czerwony", "Wystąpiła usterka w układzie ładowania akumulatora"),
            new Light("Ogrzewanie tylnej szyby", "defrost", "zielony", "Sygnalizuje włączenie systemu ogrzewania tylnej szyby"),
            new Light("Brak kluczyka w samochodzie", "key", "zielony", "Sygnalizuje brak kluczyka w samochodzie"),
            new Light("Lampka ostrzegawcza płynu do spryskiwaczy", "washer", "zielony", "Sygnalizuje niski poziom płynu do spryskiwaczy"),
            new Light("Lampka ostrzegawcza filtra cząsteczek stałych", "filter", "żółte", "Wystąpiła usterka filtra cząsteczek stałych"),
            new Light("Lampka sygnalizacyjna poślizgu", "esc", "żółte", "Sygnalizuje usterkę układu stabilizacji toru jazdy "),
            new Light("Lampka kontrolna trybu ECO", "eco", "zielony", "Wybrano tryb jazdy ECO"),
            new Light("Lampka ostrzegawcza o stanie filtra paliwa", "water", "żółte", "Sygnalizuje obecność wody w filtrze paliwa"),
            new Light("Lampka ostrzegawcza o możliwym oblodzeniu nawierzchni", "frost", "żółte", "Występuje przy niskich temperaturach i sygnalizuje oblodzeniu nawierzchni"),
            new Light("Lampka kontrolna przednich świateł przeciwmgielnych", "fog1", "zielony", "Sygnalizuje włączenie przednich świateł przeciwmgielnych"),
            new Light("Lampka kontrolna tylnych świateł przeciwmgielnych", "fog2", "zielony", "Sygnalizuje włączenie tylnych świateł przeciwmgielnych"),
            new Light("Lampka kontrolna świateł drogowych", "light1", "zielony", "Sygnalizuje włączenie świateł drogowych"),
            new Light("Lampka kontrolna kierunkowskazów", "direction", "zielony", "Sygnalizuje włączenie kierunkowskazu lub sygnalizacji awaryjnej."),
            new Light("Lampka ostrzegawcza układu ABS", "abs", "zielony", "Sygnalizuje usterkę układu zapobiegania blokowaniu kół podczas hamowania (ABS)"),
            new Light("Lampka kontrolna pedału sprzęgła", "clutch", "żółte", "Sygnalizuje brak wciśniętego pedału sprzęgła podczas uruchamiania samochodu."),
            new Light("Lampka ostrzegawcza układu hamulcowego", "bword", "czerwony", "Niski poziom pyłnu w układzie hamulcowym lub usterk ́w układzie hamulcowym, lampka ta świeci się również, gdy hamulec postojowy nie jest zwolniony. Jeśli po całkowitym zwolnieniu hamulca postojowego lampka zgaśnie, układ jest sprawny.")
//            new Light("", "", "", ""),
            );

    public List<Light> getAllLIGHTS() {
        return All_LIGHTS;
    }

    public Light findByName(String name) {
        for (Light light : All_LIGHTS) {
            if (light.getName().equals(name)) {
                return light;
            }
        }
        return null;
    }

}
