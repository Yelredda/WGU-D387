package edu.wgu.d387_sample_code.config;


import edu.wgu.d387_sample_code.convertor.ReservationEntityToReservationResponseConverter;
import edu.wgu.d387_sample_code.convertor.ReservationRequestToReservationEntityConverter;
import edu.wgu.d387_sample_code.convertor.RoomEntityToReservableRoomResponseConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;

import java.util.HashSet;
import java.util.Set;

@Configuration public class ConversionConfig {

        @Autowired
        ApplicationContext context;

        private Set<Converter> getConverters() {
                Set<Converter> converters = new HashSet<Converter>();
                converters.add(new RoomEntityToReservableRoomResponseConverter());
                converters.add(new ReservationRequestToReservationEntityConverter(context));
                converters.add(new ReservationEntityToReservationResponseConverter());

                return converters;
        }

        @Bean public ConversionService conversionService() {
                ConversionServiceFactoryBean bean = new ConversionServiceFactoryBean();
                bean.setConverters(getConverters());
                bean.afterPropertiesSet();

                return bean.getObject();
        }
}
