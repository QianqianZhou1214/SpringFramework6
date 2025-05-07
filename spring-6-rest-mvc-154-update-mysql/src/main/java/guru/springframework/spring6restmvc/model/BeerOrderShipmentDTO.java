package guru.springframework.spring6restmvc.model;

import guru.springframework.spring6restmvc.entities.BeerOrder;
import jakarta.persistence.Column;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Version;
import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;
import java.util.UUID;

@Builder
@Data
public class BeerOrderShipmentDTO {

    private UUID id;

    private Long version;

    private BeerOrder beerOrder;

    private String trackingNumber;


    private Timestamp createdDate;

    private Timestamp lastModifiedDate;
}
