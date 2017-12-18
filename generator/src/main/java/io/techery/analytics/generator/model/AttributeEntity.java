package io.techery.analytics.generator.model;

public class AttributeEntity {

   public final String attributeKey;
   public final String attributeAccessibleFieldName;

   public AttributeEntity(String attributeKey, String attributeAccessibleFieldName) {
      this.attributeKey = attributeKey;
      this.attributeAccessibleFieldName = attributeAccessibleFieldName;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) return true;
      if (!(obj instanceof AttributeEntity)) return false;

      final AttributeEntity other = (AttributeEntity) obj;
      return this.attributeKey.equals(other.attributeKey);
   }

   @Override
   public int hashCode() {
      return attributeKey.hashCode();
   }
}
