package com.meshal.orderstock.service;

import com.meshal.orderstock.bo.CreateStockRequest;
import com.meshal.orderstock.bo.UpdateStockResponse;

public interface StockService {

    UpdateStockResponse updateStock(CreateStockRequest request);

    void addItems(CreateStockRequest stock);
}