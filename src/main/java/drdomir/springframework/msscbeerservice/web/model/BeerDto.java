package drdomir.springframework.msscbeerservice.web.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@Slf4j
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BeerDto {
    @Null
    private UUID id;
    @Null
    private Integer version;
    @Null
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ssx", shape = JsonFormat.Shape.STRING)
    private OffsetDateTime createdDate;
    @Null
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ssx", shape = JsonFormat.Shape.STRING)
    private OffsetDateTime lastModifiedDate;
    @NotBlank
    private String beerName;
    @NonNull
    private BeerStyleEnum beerStyle;
    @Positive
    @NonNull
    private Long upc;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @NonNull
    @Positive
    private BigDecimal price;
    private Integer quantityOnHand;
}
