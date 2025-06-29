
import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.anyString;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ExternalApi {
    public String getData(String param) {
        return "Real " + param;
    }
}

class MyService {
    private ExternalApi api;
    public MyService(ExternalApi api) {
        this.api = api;
    }
    public String fetchData(String param) {
        return api.getData(param);
    }
}

public class MyServiceTest {
    @Test
    public void testArgumentMatching() {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        MyService service = new MyService(mockApi);
        service.fetchData("test");
        verify(mockApi).getData(anyString());
    }
}
