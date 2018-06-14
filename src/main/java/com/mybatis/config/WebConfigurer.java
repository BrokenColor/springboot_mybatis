package com.mybatis.config;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter4;

/**
 * 自定义消息转换器
 * 
 * @author BrokenColor
 * @date 2018年6月14日
 */
@Configuration
public class WebConfigurer extends WebMvcConfigurationSupport {

	/**
	 * 修改自定义消息转换器
	 */
	@Override
	protected void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		// TODO Auto-generated method stub
		// super.configureMessageConverters(converters);
		FastJsonHttpMessageConverter4 converter = new FastJsonHttpMessageConverter4();
		converter.setSupportedMediaTypes(getSupportedMediaTypes());
		FastJsonConfig config = new FastJsonConfig();
		config.setSerializerFeatures(
				// string null->""
				SerializerFeature.WriteNullStringAsEmpty,
				// number null-> 0
				SerializerFeature.WriteNullNumberAsZero, 
				//bollean null->false
				SerializerFeature.WriteNullBooleanAsFalse,
				//禁止循环引用
				SerializerFeature.DisableCircularReferenceDetect
				);
		converter.setFastJsonConfig(config);
		converter.setDefaultCharset(Charset.forName("UTF-8"));
		converters.add(converter);
	}
	//
	public List<MediaType> getSupportedMediaTypes() {
		List<MediaType> supproteMeidaTypes = new ArrayList<>();
		supproteMeidaTypes.add(MediaType.APPLICATION_JSON);
		supproteMeidaTypes.add(MediaType.APPLICATION_JSON_UTF8);
		supproteMeidaTypes.add(MediaType.APPLICATION_ATOM_XML);
		supproteMeidaTypes.add(MediaType.APPLICATION_FORM_URLENCODED);
		supproteMeidaTypes.add(MediaType.APPLICATION_OCTET_STREAM);
		supproteMeidaTypes.add(MediaType.APPLICATION_PDF);
		supproteMeidaTypes.add(MediaType.APPLICATION_RSS_XML);
		supproteMeidaTypes.add(MediaType.APPLICATION_XHTML_XML);
		supproteMeidaTypes.add(MediaType.APPLICATION_XML);
		supproteMeidaTypes.add(MediaType.IMAGE_GIF);
		supproteMeidaTypes.add(MediaType.IMAGE_JPEG);
		supproteMeidaTypes.add(MediaType.IMAGE_PNG);
		supproteMeidaTypes.add(MediaType.TEXT_EVENT_STREAM);
		supproteMeidaTypes.add(MediaType.TEXT_HTML);
		supproteMeidaTypes.add(MediaType.TEXT_MARKDOWN);
		supproteMeidaTypes.add(MediaType.TEXT_XML);
		supproteMeidaTypes.add(MediaType.TEXT_PLAIN);
		return supproteMeidaTypes;
	}
	
	

}
