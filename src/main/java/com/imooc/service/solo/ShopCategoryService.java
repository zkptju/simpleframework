package com.imooc.service.solo;

import com.imooc.entity.bo.ShopCategory;
import com.imooc.entity.dto.Result;

import java.util.List;

/**
 * @description:
 * @author: ZKP
 * @time: 2022/10/17
 */
public interface ShopCategoryService {
    Result<Boolean> addShopCategory(ShopCategory shopCategory);
    Result<Boolean> removeShopCategory(int shopCategoryId);
    Result<Boolean> modifyShopCategory(ShopCategory shopCategory);
    Result<ShopCategory> queryShopCategoryById(int shopCategoryId);
    Result<List<ShopCategory>> queryShopCategory(ShopCategory headLineCondition, int pageIndex, int pageSize);
}
