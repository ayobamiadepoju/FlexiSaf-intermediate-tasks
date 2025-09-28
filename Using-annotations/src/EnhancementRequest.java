import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface EnhancementRequest {

    int id();
    String synopsis();
    String engineer() default "unassigned";
    String date() default "unknown";
}
