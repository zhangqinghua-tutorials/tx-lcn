/*
 * Copyright 2017-2019 CodingApi .
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.codingapi.txlcn.txmsg.params;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Description:
 * Date: 2018/12/5
 *
 * @author ujued
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class NotifyGroupParams implements Serializable {
    /**
     * 事务单元Id
     */
    private String unitId;

    /**
     * 事务分组Id
     */
    private String groupId;

    /**
     * 支付状态 0-回滚 1-提交
     */
    private int state;
}
