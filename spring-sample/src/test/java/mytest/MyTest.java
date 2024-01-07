package mytest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.BeanMetadataAttribute;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.support.ChildBeanDefinition;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class MyTest {

    @Test
    public void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        User user = context.getBean("user", User.class);
        System.out.println(user);

		String[] names = context.getBeanDefinitionNames();
		for (String name : names) {
			System.out.println(name);
		}
	}

	@Test
	public void testGenericBeanDefinition(){
		GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
		beanDefinition.setBeanClassName("com.dongguo.entity.User");
		MutablePropertyValues propertyValues = new MutablePropertyValues();
		propertyValues.addPropertyValue("name","zhangsan");
		propertyValues.addPropertyValue("age",18);
		beanDefinition.setPropertyValues(propertyValues);

	}

	@Test
	public void testRootBeanDefinition(){
		RootBeanDefinition dog = new RootBeanDefinition();
		dog.setBeanClassName("com.dongguo.entity.Dog");
		BeanMetadataAttribute color = new BeanMetadataAttribute("color", "black");
		BeanMetadataAttribute age = new BeanMetadataAttribute("age", 1);

		dog.addMetadataAttribute(color);
		dog.addMetadataAttribute(age);

		//子BeanDefinition的创建需要依赖父BeanDefinition
		ChildBeanDefinition teddy = new ChildBeanDefinition("dog");
		teddy.setBeanClassName("com.dongguo.entity.teddyDog");
		BeanMetadataAttribute name = new BeanMetadataAttribute("name", "小黑");
		teddy.addMetadataAttribute(name);
	}
}
