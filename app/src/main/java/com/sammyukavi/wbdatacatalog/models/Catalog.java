/*
 * MIT License
 *
 * Copyright (c) 2017 Sammy Ukavi
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.sammyukavi.wbdatacatalog.models;

import java.io.Serializable;

/**
 * A POJO class for unserializing the catalog json object
 */
public class Catalog implements Serializable {
	
	private int total;
	
	private int per_page;
	
	private int page;
	
	private int pages;
	
	private DataCatalog[] datacatalog;
	
	public int getTotal() {
		return total;
	}
	
	public void setTotal(int total) {
		this.total = total;
	}
	
	public int getPer_page() {
		return per_page;
	}
	
	public void setPer_page(int per_page) {
		this.per_page = per_page;
	}
	
	public int getPage() {
		return page;
	}
	
	public void setPage(int page) {
		this.page = page;
	}
	
	public int getPages() {
		return pages;
	}
	
	public void setPages(int pages) {
		this.pages = pages;
	}
	
	public DataCatalog[] getDatacatalog() {
		return datacatalog;
	}
	
	public void setDatacatalog(DataCatalog[] datacatalog) {
		this.datacatalog = datacatalog;
	}
	
	@Override
	public String toString() {
		return "ClassPojo [total = " + total + ", per_page = " + per_page + ", page = " + page + ", pages = " + pages
				+ ", datacatalog = " + datacatalog + "]";
	}
}
