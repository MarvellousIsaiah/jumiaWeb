package com.Jumia.JumiaWeb.dto;

import com.Jumia.JumiaWeb.data.model.OrderLineItems;
import lombok.*;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequest {
    private List<OrderLineItemsDto> orderLineItemsList;
}
