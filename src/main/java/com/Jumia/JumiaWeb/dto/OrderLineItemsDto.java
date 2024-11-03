package com.Jumia.JumiaWeb.dto;

import lombok.*;

import java.math.BigDecimal;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class OrderLineItemsDto {
    private String id;
    private BigDecimal price;
    private Integer quantity;
    private String code;
}
