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

package com.sammyukavi.wbdatacatalog;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.sammyukavi.wbdatacatalog.models.Catalog;

import android.content.ContentProvider;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import retrofit2.Call;

@PrepareForTest({ Context.class, ContentResolver.class, ContentProvider.class, ContentValues.class })
@RunWith(PowerMockRunner.class)
public abstract class UnitTestBase {
	
	@Before
	public void initMocks() {
		MockitoAnnotations.initMocks(this);
	}
	
	protected <T> Call<Catalog> mockSuccessCall(Catalog catalog) {
		return new MockSuccessResponse<Catalog>(catalog);
	}
	
	protected <T> Call<T> mockSuccessCall(T object) {
		return new MockSuccessResponse<>(object);
	}
	
	protected <T> Call<T> mockErrorCall(int code) {
		return new MockErrorResponse<>(code);
	}
	
	protected <T> Call<T> mockFailureCall() {
		Throwable throwable = Mockito.mock(Throwable.class);
		return new MockFailure<>(throwable);
	}
}