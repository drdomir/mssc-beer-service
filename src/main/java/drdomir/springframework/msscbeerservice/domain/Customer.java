package drdomir.springframework.msscbeerservice.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * Created by dsavic on 6/4/2022
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer {
    private UUID id;
    private String name;
}
