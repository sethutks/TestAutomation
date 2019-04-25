package attribute;

import java.io.Serializable;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

public class ByAlt extends By implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public String altLctrValue;
	
	public ByAlt(String altLctrValue){
        this.altLctrValue = altLctrValue;
    }

	@Override
	public List<WebElement> findElements(SearchContext context) {
		List<WebElement> altElements = context.findElements(By.xpath("//*[@for='"+altLctrValue+"']"));
		return altElements;
	}

}
