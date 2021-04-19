package ro.msg.learning.shop.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LocationDTO {
    private int locationID;
    private String name;
    private String countryAdress;
    private String cityAdress;
    private String countyAdress;
    private String streetAdress;
}
