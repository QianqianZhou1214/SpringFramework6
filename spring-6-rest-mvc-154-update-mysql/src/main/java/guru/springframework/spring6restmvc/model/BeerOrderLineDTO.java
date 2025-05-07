package guru.springframework.spring6restmvc.model;

import guru.springframework.spring6restmvc.entities.Beer;
import guru.springframework.spring6restmvc.entities.BeerOrder;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Version;
import jakarta.validation.constraints.Min;
import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;
import java.util.UUID;


@Builder
@Data
public class BeerOrderLineDTO {

    private UUID id;

    private Long version;

    private Timestamp createdDate;

    private Timestamp lastModifiedDate;


    private BeerDTO beer;

    @Min(value = 1, message = "Quantity On Hand must be greater than 0")
    private Integer orderQuantity;
    private Integer quantityAllocated;
}
