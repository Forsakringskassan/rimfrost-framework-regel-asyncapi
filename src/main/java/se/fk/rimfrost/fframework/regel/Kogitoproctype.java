package se.fk.rimfrost.framework.regel;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Kogitoproctype
{
   BPMN("BPMN");

   private String value;

   private Kogitoproctype(String value)
   {
      this.value = value;
   }

   @JsonValue
   public String getValue()
   {
      return this.value;
   }

   @JsonCreator
   public static Kogitoproctype fromValue(String value)
   {
      for (Kogitoproctype e : values())
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
