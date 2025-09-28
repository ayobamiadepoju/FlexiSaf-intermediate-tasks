import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
@EnhancementRequest(id = 1, synopsis = "increase rate/hr")
public class RequestImpl {
    @EnhancementRequest(id = 2, synopsis = "melting point", engineer = "John Doe", date = "Sept, 2025")

    public static void method() {
        RequestImpl request = new RequestImpl();

        try {
            Class<?> c = request.getClass();
            Annotation[] annotation = c.getAnnotations();

            System.out.println("All annotations for RequestImpl:");
            for(Annotation a : annotation)
                System.out.println(a);
            System.out.println();

            Method m = c.getMethod("method");
            annotation = m.getAnnotations();
            System.out.println("All annotations for method:");
            for(Annotation a : annotation)
                System.out.println(a);
        } catch (NoSuchMethodException exc) {
            System.out.println("Method Not Found.");
        }
    }
}
