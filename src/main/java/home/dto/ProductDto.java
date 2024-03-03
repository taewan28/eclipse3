package home.dto;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class ProductDto {
	private String pcode;
	private String category;
	private String pname;
	private int price;
	
	@Override
    public String toString() {
        return String.format("%6s %15s %40s\t %,8d \n", 
                            category,pcode,pname,price);
    }
}
