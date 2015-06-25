package com.collectionsdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

/**
 * @desc 这里主要测试collections的copy方法
 * @since 问题是在公司第二个项目的复杂条件筛选过程中，发现的
 * @result collections的copy方法，并不是所谓的深度复制，依旧只是普通的浅复制
 * @result 怎么解决这个问题呢，采用clone方法吧，看下面的测试方法
 * @author xingxing
 *
 */
public class CollectionCopy {
	public static void main(String[] args) {
		List<Person> list=new ArrayList<Person>();
		list.add(new Person("1001", "张三",100));
		list.add(new Person("1002", "张三",100));
		list.add(new Person("1003", "张三",100));
		
		
		List<Person> newPersonList=new ArrayList<Person>(Arrays.asList(new Person[list.size()]));
		
		Collections.copy(newPersonList,list);
		
		//这里比较一下，两个对象（集合里面的第一个元素）的地址是不是一样的：  内容一样，地址也是一样的
		
		System.out.println(list.get(0).hashCode()+"=="+list.get(0));
		System.out.println(newPersonList.get(0).hashCode()+"=="+newPersonList.get(0));
		
		
		/////比较集合本身，集合本身的地址，内容都是一样的
		System.out.println(list.hashCode()+"=="+list);
		System.out.println(newPersonList.hashCode()+"=="+newPersonList);
		
		
		//那么可以得出，这种复制方式，并不是所谓的深度复制，也只是浅复制，复制的是内存地址，
		//修改第一个元素的内容，可以观察到，两个list的内容都会跟着变
		list.get(0).setCount(200);
		System.out.println("******");
		System.out.println(list.hashCode()+"=="+list);
		System.out.println(newPersonList.hashCode()+"=="+newPersonList);
	}
	@Test
	public void testClone() throws Exception{
		List<Person> list=new ArrayList<Person>();
		list.add(new Person("1001", "张三",100));
		list.add(new Person("1002", "张三",100));
		list.add(new Person("1003", "张三",100));
		
		List<Person> newPersonList=new ArrayList<Person>();
		for(int i=0;i<list.size();i++){
			newPersonList.add((Person) list.get(i).clone());
		}
		
		
		/////比较集合本身，集合本身的地址不一样，内容是一样的
		System.out.println(list.hashCode()+"=="+list);
		System.out.println(newPersonList.hashCode()+"=="+newPersonList);
		
//		修改其中一个的内容，并不会出现两个都变化的情况
		list.get(0).setCount(200);
		System.out.println(list.hashCode()+"=="+list);
		System.out.println(newPersonList.hashCode()+"=="+newPersonList);
	}
}
