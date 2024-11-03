package com.Jumia.JumiaWeb.services;

import com.Jumia.JumiaWeb.data.model.Order;
import com.Jumia.JumiaWeb.dto.OrderLineItemsDto;
import com.Jumia.JumiaWeb.dto.OrderRequest;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OrderServiceImpl {
    public void  placeOrder(OrderRequest orderRequest){
       Order order = new Order();
       order.setOrderNumber(UUID.randomUUID().toString());
       orderRequest.getOrderLineItemsList()
               .stream()
               .map(orderLineItemsDto -> mapToDto(orderLineItemsDto));

    }
    private Order  mapToDto(OrderLineItemsDto orderLineItemsDto){
        Order order = new Order();
        return null;



    }
}
