package se.fk.rimfrost.framework.regel;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.util.Map;
import java.util.Objects;

import java.io.Serializable;
import java.util.HashMap;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

@SuppressFBWarnings("EI_EXPOSE_REP")
public class RegelErrorInformation implements Serializable
{
   private static final long serialVersionUID = 1L;
   @JsonProperty(required = true)
   private String felkod;
   @JsonProperty(required = true)
   private String felmeddelande;
   @JsonAnySetter
   @JsonInclude(Include.NON_NULL)
   private HashMap<String, Object> additionalProperties;

   public RegelErrorInformation()
   {
   }

   public String getFelkod()
   {
      return this.felkod;
   }

   public void setFelkod(String felkod)
   {
      this.felkod = felkod;
   }

   public String getFelmeddelande()
   {
      return this.felmeddelande;
   }

   public void setFelmeddelande(String felmeddelande)
   {
      this.felmeddelande = felmeddelande;
   }

   @JsonAnyGetter
   public HashMap<String, Object> getAdditionalProperties()
   {
      return this.additionalProperties;
   }

   public void setAdditionalProperties(HashMap<String, Object> additionalProperties)
   {
      this.additionalProperties = additionalProperties;
   }

   public boolean equals(Object o)
   {
      if (this == o)
      {
         return true;
      }
      else if (o != null && this.getClass() == o.getClass())
      {
         RegelErrorInformation self = (RegelErrorInformation) o;
         return Objects.equals(this.felkod, self.felkod) && Objects.equals(this.felmeddelande, self.felmeddelande)
               && Objects.equals(this.additionalProperties, self.additionalProperties);
      }
      else
      {
         return false;
      }
   }

   public int hashCode()
   {
      return Objects.hash(new Object[]
      {
            this.felkod, this.felmeddelande, this.additionalProperties
      });
   }

   public String toString()
   {
      return "class RegelErrorInformation {\n    felkod: " + this.toIndentedString(this.felkod) + "\n    felmeddelande: "
            + this.toIndentedString(this.felmeddelande) + "\n    additionalProperties: "
            + this.toIndentedString(this.additionalProperties) + "\n}";
   }

   private String toIndentedString(Object o)
   {
      return o == null ? "null" : o.toString().replace("\n", "\n    ");
   }
}
