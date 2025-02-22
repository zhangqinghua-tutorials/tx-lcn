// /*
//  * Copyright 2017-2019 CodingApi .
//  *
//  * Licensed under the Apache License, Version 2.0 (the "License");
//  * you may not use this file except in compliance with the License.
//  * You may obtain a copy of the License at
//  *
//  *      http://www.apache.org/licenses/LICENSE-2.0
//  *
//  * Unless required by applicable law or agreed to in writing, software
//  * distributed under the License is distributed on an "AS IS" BASIS,
//  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//  * See the License for the specific language governing permissions and
//  * limitations under the License.
//  */
// package com.codingapi.txlcn.tracing.http;
//
// import com.codingapi.txlcn.tracing.Tracings;
// import feign.Feign;
// import feign.RequestInterceptor;
// import feign.RequestTemplate;
// import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
// import org.springframework.core.annotation.Order;
// import org.springframework.stereotype.Component;
//
// /**
//  * Description:
//  * Date: 19-1-28 下午3:47
//  *
//  * @author ujued
//  */
// @ConditionalOnClass(Feign.class)
// @Component
// @Order
// public class FeignTracingTransmitter implements RequestInterceptor {
//
//     @Override
//     public void apply(RequestTemplate requestTemplate) {
//         Tracings.transmit(requestTemplate::header);
//     }
// }
