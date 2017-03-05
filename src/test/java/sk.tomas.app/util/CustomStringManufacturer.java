package sk.tomas.app.util;

import sk.tomas.app.iam.model.input.ExcerciseInput;
import uk.co.jemos.podam.api.AttributeMetadata;
import uk.co.jemos.podam.api.DataProviderStrategy;
import uk.co.jemos.podam.typeManufacturers.StringTypeManufacturerImpl;

import java.lang.reflect.Type;
import java.util.Map;

/**
 * Created by Tomas Pachnik on 02-Mar-17.
 */
public class CustomStringManufacturer extends StringTypeManufacturerImpl {

    @Override
    public String getType(DataProviderStrategy strategy,
                          AttributeMetadata attributeMetadata,
                          Map<String, Type> genericTypesArgumentsMap) {

        if (ExcerciseInput.class.isAssignableFrom(attributeMetadata.getPojoClass())) {

            if ("name".equals(attributeMetadata.getAttributeName())) {
                return "ZHYBY";
            }
        }
        return super.getType(strategy, attributeMetadata, genericTypesArgumentsMap);
    }

}
