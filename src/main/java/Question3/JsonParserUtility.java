package Question3;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;

public class JsonParserUtility {

    private static final ObjectMapper objectMapper = new ObjectMapper(new JsonFactory());

    public static Object parseJsonWithPrecision(String jsonString) throws IOException {
        JsonNode rootNode = objectMapper.readTree(jsonString);
        return convertJsonNode(rootNode);
    }

    private static Object convertJsonNode(JsonNode node) {
        if (node.isObject()) {
            Map<String, Object> res = new HashMap<>();
            Iterator<Map.Entry<String, JsonNode>> fields = node.fields();
            while (fields.hasNext()) {
                Map.Entry<String, JsonNode> field = fields.next();
                res.put(field.getKey(), convertJsonNode(field.getValue()));
            }
            return res;
        } else if (node.isArray()) {
            List<Object> res = new ArrayList<>();
            for (JsonNode elementNode : node) {
                res.add(convertJsonNode(elementNode));
            }
            return res;
        } else if (node.isNumber()) {
            return new BigDecimal(node.asText());
        } else if (node.isBoolean()) {
            return node.booleanValue();
        } else if (node.isTextual()) {
            return node.textValue();
        } else if (node.isNull()) {
            return null;
        } else {
            throw new IllegalArgumentException("Unsupported JSON node type is: " + node.getNodeType());
        }
    }
}
