package simsek.ali.VeterinaryManagementProject.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VaccineWithoutCustomerRequestDto {
    private String name;
    private String code;
    private String protectionStartDate;
    private String protectionFinishDate;
    private Long animalId;
}
