package fhir

class ResourceIndexString extends ResourceIndexTerm{
  String string_value

  static mapping = {
    string_value type: 'text'
    version false
  }
}

