package guru.springframework.spring6restmvc.model;

import guru.springframework.spring6restmvc.entities.BeerOrder;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.UUID;

@Builder
@Data
public class BeerOrderShipmentDTO {

    private UUID id;

    private Long version;

    @NotBlank
    private String trackingNumber;


    private Timestamp createdDate;
    private Timestamp lastModifiedDate;
}
