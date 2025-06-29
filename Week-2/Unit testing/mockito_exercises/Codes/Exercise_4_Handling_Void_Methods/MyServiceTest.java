
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ExternalApi {
    public void sendData(String data) {
        // Normally sends data
    }
}

class MyService {
    private ExternalApi api;
    public MyService(ExternalApi api) {
        this.api = api;
    }
    public void process(String data) {
        api.sendData(data);
    }
}

public class MyServiceTest {
    @Test
    public void testVoidMethod() {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        doNothing().when(mockApi).sendData("Hello");
        MyService service = new MyService(mockApi);
        service.process("Hello");
        verify(mockApi).sendData("Hello");
    }
}
