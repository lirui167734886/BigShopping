package com.bigshopping.bean;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author LiRui
 * @since 2019-11-12
 */
@TableName("shop_cateloge")
public class Cateloge implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 店铺商品分类id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 店铺商品分类名字
     */
    private String shopCatelogeName;
    /**
     * 店铺商品分类手机图标
     */
    private String shopCatelogePhoneLogo;
    /**
     * 上级分类
     */
    private Integer shopCatelogeParentCateloge;
    /**
     * 数量单位
     */
    private String shopCatelogeNumUnit;
    /**
     * 店铺商品分类排序
     */
    private String shopCatelogeOrder;
    /**
     * 是否展示分类
     */
    private Integer isShow;
    /**
     * 是否展示导航
     */
    private Integer isShowNav;
    /**
     * 店铺商品分类属性
     */
    private String shopCatelogeAttr;
    /**
     * 店铺商品分类关键字
     */
    private String shopCatelogeKeyWords;
    /**
     * 店铺商品描述
     */
    private String shopCatelogeDesc;
    /**
     * 店铺商品分类是否启用
     */
    private Integer state;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShopCatelogeName() {
        return shopCatelogeName;
    }

    public void setShopCatelogeName(String shopCatelogeName) {
        this.shopCatelogeName = shopCatelogeName;
    }

    public String getShopCatelogePhoneLogo() {
        return shopCatelogePhoneLogo;
    }

    public void setShopCatelogePhoneLogo(String shopCatelogePhoneLogo) {
        this.shopCatelogePhoneLogo = shopCatelogePhoneLogo;
    }

    public Integer getShopCatelogeParentCateloge() {
        return shopCatelogeParentCateloge;
    }

    public void setShopCatelogeParentCateloge(Integer shopCatelogeParentCateloge) {
        this.shopCatelogeParentCateloge = shopCatelogeParentCateloge;
    }

    public String getShopCatelogeNumUnit() {
        return shopCatelogeNumUnit;
    }

    public void setShopCatelogeNumUnit(String shopCatelogeNumUnit) {
        this.shopCatelogeNumUnit = shopCatelogeNumUnit;
    }

    public String getShopCatelogeOrder() {
        return shopCatelogeOrder;
    }

    public void setShopCatelogeOrder(String shopCatelogeOrder) {
        this.shopCatelogeOrder = shopCatelogeOrder;
    }

    public Integer getIsShow() {
        return isShow;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    public Integer getIsShowNav() {
        return isShowNav;
    }

    public void setIsShowNav(Integer isShowNav) {
        this.isShowNav = isShowNav;
    }

    public String getShopCatelogeAttr() {
        return shopCatelogeAttr;
    }

    public void setShopCatelogeAttr(String shopCatelogeAttr) {
        this.shopCatelogeAttr = shopCatelogeAttr;
    }

    public String getShopCatelogeKeyWords() {
        return shopCatelogeKeyWords;
    }

    public void setShopCatelogeKeyWords(String shopCatelogeKeyWords) {
        this.shopCatelogeKeyWords = shopCatelogeKeyWords;
    }

    public String getShopCatelogeDesc() {
        return shopCatelogeDesc;
    }

    public void setShopCatelogeDesc(String shopCatelogeDesc) {
        this.shopCatelogeDesc = shopCatelogeDesc;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Cateloge{" +
        ", id=" + id +
        ", shopCatelogeName=" + shopCatelogeName +
        ", shopCatelogePhoneLogo=" + shopCatelogePhoneLogo +
        ", shopCatelogeParentCateloge=" + shopCatelogeParentCateloge +
        ", shopCatelogeNumUnit=" + shopCatelogeNumUnit +
        ", shopCatelogeOrder=" + shopCatelogeOrder +
        ", isShow=" + isShow +
        ", isShowNav=" + isShowNav +
        ", shopCatelogeAttr=" + shopCatelogeAttr +
        ", shopCatelogeKeyWords=" + shopCatelogeKeyWords +
        ", shopCatelogeDesc=" + shopCatelogeDesc +
        ", state=" + state +
        "}";
    }
}
