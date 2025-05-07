package guru.springframework.spring6restmvc.model;

import guru.springframework.spring6restmvc.entities.Beer;
import guru.springframework.spring6restmvc.entities.BeerOrder;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Version;
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

    public boolean isNew() { return this.id == null; }


    private BeerDTO beer;

    private Integer orderQuantity = 0;
    private Integer quantityAllocated = 0;
}
