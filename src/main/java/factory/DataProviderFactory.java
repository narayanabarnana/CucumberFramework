package factory;

import dataProvider.ConfigDataProvider;

public class DataProviderFactory {
	
	
	
	public static ConfigDataProvider getConfig()
	{
		
		ConfigDataProvider config=new ConfigDataProvider();
		return config;
		
	}
	
//	public static ExcelDataConfig getExcel()
//	{
//		
//		ExcelDataConfig excel=new ExcelDataConfig("F:\\Selenium Framework\\com.orangeHRM.hybridFramework\\TestData\\OrangeHRM.xlsx");
//		return excel;
//		
//	}

}
