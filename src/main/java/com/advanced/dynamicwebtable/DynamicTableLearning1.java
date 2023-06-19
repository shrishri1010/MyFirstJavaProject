package com.advanced.dynamicwebtable;

import java.util.List;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicTableLearning1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		/*WebDriver driver;
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://only-testing-blog.blogspot.in/2013/09/test.html");
		WebElement myTable = driver.findElement(By.xpath(".//*[@id='post-body-6522850981930750493']/div[1]/table"));
		List<WebElement> row_table = myTable.findElements(By.tagName("tr"));
		int rowsize =row_table.size();
		//System.out.println("rowCount ---->> " + rowsize);
		
		//Loop will execute till the last row of table.
				for (int row = 0; row < rowsize; row++) {
					//To locate columns(cells) of that specific row.
					List<WebElement> Columns_row = row_table.get(row).findElements(By.tagName("td"));
					//To calculate no. of columns(cells) In that specific row.
					int coloums_count = Columns_row.size();
					//System.out.println("Number of coloumns -- " + coloums_count);
					
					for (int coloumn = 0; coloumn < coloums_count; coloumn++) {
						String celText = Columns_row.get(coloumn).getText();
						System.out.println("Cell Value Of row number "+row+" and column number "+coloumn+" Is "+celText);
					}
				}*/
	}
}

