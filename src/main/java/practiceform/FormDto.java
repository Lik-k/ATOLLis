package practiceform;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.Accessors;

@Getter
@AllArgsConstructor
@Builder
@Accessors(fluent = true)
public class FormDto {

    protected String testFirstName;
    protected String testLastName;
    protected String testEmail;
    protected String testMobileNumber;
    protected String testCurrentAddress;

    public static FormDto testData() {
        return builder()
                .testFirstName("Eugene")
                .testLastName("Mukomel")
                .testEmail("Mukomel@mail.com")
                .testMobileNumber("89107460005")
                .testCurrentAddress("Moskovskiy Prospekt, 122, Voronezh, Voronezh Oblast, 394068")
                .build();
    }

}
