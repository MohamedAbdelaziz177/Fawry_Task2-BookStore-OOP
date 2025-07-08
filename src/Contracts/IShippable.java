package Contracts;

public interface IShippable extends ISaleable{

    Long getStock();
    void setStock(Long stock);
}
