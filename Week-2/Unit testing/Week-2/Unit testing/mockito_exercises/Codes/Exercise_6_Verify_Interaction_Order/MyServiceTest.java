
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

class ExternalApi {
    public void stepOne() {}
    public void stepTwo() {}
}

public class MyServiceTest {
    @Test
    public void testInteractionOrder() {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        mockApi.stepOne();
        mockApi.stepTwo();
        InOrder inOrder = inOrder(mockApi);
        inOrder.verify(mockApi).stepOne();
        inOrder.verify(mockApi).stepTwo();
    }
}
