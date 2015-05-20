package com.mybake.ppc.html.app.model.repo.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.mybake.poc.html.uiobjects.JSProductInfo;
import com.mybake.ppc.html.app.model.repo.ProductRepo;

@Component
public class ProductRepoImp implements ProductRepo {

	private List<JSProductInfo> jsProductInfos = null;

	public ProductRepoImp() {
		// TODO need to get from Database
		if (null == jsProductInfos) {
			jsProductInfos = new ArrayList<JSProductInfo>();
			JSProductInfo jsProduct = new JSProductInfo();
			jsProduct.setCode(101);
			jsProduct.setCostPerUnit((float) 45.00);
			jsProduct.setName("White Bread");
			jsProductInfos.add(jsProduct);

			jsProduct = new JSProductInfo();
			jsProduct.setCode(102);
			jsProduct.setCostPerUnit((float) 15.00);
			jsProduct.setName("Veg Puff");
			jsProductInfos.add(jsProduct);

			jsProduct = new JSProductInfo();
			jsProduct.setCode(103);
			jsProduct.setCostPerUnit((float) 18.00);
			jsProduct.setName("Egg Puff");
			jsProductInfos.add(jsProduct);

			jsProduct = new JSProductInfo();
			jsProduct.setCode(501);
			jsProduct.setCostPerUnit((float) 10.00);
			jsProduct.setName("Coke Min");
			jsProductInfos.add(jsProduct);
		}
	}

	public List<JSProductInfo> getAllProductInfo() {
		if (null != jsProductInfos) {
			return jsProductInfos;
		}
		return null;
	}

}
