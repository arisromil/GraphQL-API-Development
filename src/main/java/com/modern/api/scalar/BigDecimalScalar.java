package com.modern.api.scalar;

import com.netflix.graphql.dgs.DgsScalar;
import graphql.scalar.GraphqlBigDecimalCoercing;

/**

 **/
@DgsScalar(name = "BigDecimal")
public class BigDecimalScalar extends GraphqlBigDecimalCoercing {

}