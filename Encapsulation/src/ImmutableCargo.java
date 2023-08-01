import java.util.Objects;

final class ImmutableCargo {
     private final int widthCargo;
     private final int heightCargo;
     private final int lengthCargo;

//     private final Dimensions dimensions;
     private final int weight;
     private final String addressTo;
     private final boolean turnOverAllowed;
     private final String cargoID;
     private final boolean fragileCargo;

     ImmutableCargo(int widthCargo, int heightCargo, int lengthCargo, int weight, String addressTo, boolean turnOverAllowed, String cargoID, boolean fragileCargo) {
//          this.dimensions = dimensions;
          this.widthCargo = widthCargo;
          this.heightCargo = heightCargo;
          this.lengthCargo = lengthCargo;
          this.weight = weight;
          this.addressTo = addressTo;
          this.turnOverAllowed = turnOverAllowed;
          this.cargoID = cargoID;
          this.fragileCargo = fragileCargo;
     }

     Dimensions cargoDimensions = new Dimensions(int widthCargo, int heightCargo, int lengthCargo);

     public int widthCargo() {
          return widthCargo;
     }

     public int heightCargo() {
          return heightCargo;
     }

     public int lengthCargo() {
          return lengthCargo;
     }

     public int weight() {
          return weight;
     }

     public String addressTo() {
          return addressTo;
     }

     public boolean turnOverAllowed() {
          return turnOverAllowed;
     }

     public String cargoID() {
          return cargoID;
     }

     public boolean fragileCargo() {
          return fragileCargo;
     }

     @Override
     public boolean equals(Object obj) {
          if (obj == this) return true;
          if (obj == null || obj.getClass() != this.getClass()) return false;
          var that = (ImmutableCargo) obj;
          return this.widthCargo == that.widthCargo &&
                  this.heightCargo == that.heightCargo &&
                  this.lengthCargo == that.lengthCargo &&
                  this.weight == that.weight &&
                  Objects.equals(this.addressTo, that.addressTo) &&
                  this.turnOverAllowed == that.turnOverAllowed &&
                  Objects.equals(this.cargoID, that.cargoID) &&
                  this.fragileCargo == that.fragileCargo;
     }

     @Override
     public int hashCode() {
          return Objects.hash(widthCargo, heightCargo, lengthCargo, weight, addressTo, turnOverAllowed, cargoID, fragileCargo);
     }

     @Override
     public String toString() {
          return "ImmutableCargo[" +
                  "widthCargo=" + widthCargo + ", " +
                  "heightCargo=" + heightCargo + ", " +
                  "lengthCargo=" + lengthCargo + ", " +
                  "weight=" + weight + ", " +
                  "addressTo=" + addressTo + ", " +
                  "turnOverAllowed=" + turnOverAllowed + ", " +
                  "cargoID=" + cargoID + ", " +
                  "fragileCargo=" + fragileCargo + ']';
     }

     public Dimensions getDimensions() {
          return dimensions;
     }
}
