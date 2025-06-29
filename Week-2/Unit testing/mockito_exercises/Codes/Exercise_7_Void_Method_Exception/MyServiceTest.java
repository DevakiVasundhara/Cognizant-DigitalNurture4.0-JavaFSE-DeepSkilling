
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ExternalApi {
    public void riskyOperation() throws Exception {
        throw new Exception("Failure");
    }
}

public class MyServiceTest {
    @Test
    public void testVoidMethodWithException() throws Exception {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        doThrow(new Exception("Failure")).when(mockApi).riskyOperation();
        try {
            mockApi.riskyOperation();
        } catch (Exception e) {
            assert(e.getMessage().equals("Failure"));
        }
        verify(mockApi).riskyOperation();
    }
}
