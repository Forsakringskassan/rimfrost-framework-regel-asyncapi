package se.fk.rimfrost.framework.regel;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Utfall
{
   JA("Ja"), NEJ("Nej"), UTREDNING("Utredning"), ERROR("Error");

   private String value;

   private Utfall(String value)
   {
      this.value = value;
   }

   @JsonValue
   public String getValue()
   {
      return this.value;
   }

   @JsonCreator
   public static Utfall fromValue(String value)
   {
      for (Utfall e : values())
      {
         if (e.value.equals(value))
         {
            return e;
         }
      }

      throw new IllegalArgumentException("Unexpected value '" + value + "'");
   }

   public String toString()
   {
      return String.valueOf(this.value);
   }
}
