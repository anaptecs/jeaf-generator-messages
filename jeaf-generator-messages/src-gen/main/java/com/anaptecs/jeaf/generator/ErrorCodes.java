package com.anaptecs.jeaf.generator;

import com.anaptecs.jeaf.xfun.annotations.MessageResource;
import com.anaptecs.jeaf.xfun.api.XFun;
import com.anaptecs.jeaf.xfun.api.errorhandling.ErrorCode;
import com.anaptecs.jeaf.xfun.api.messages.MessageID;
import com.anaptecs.jeaf.xfun.api.messages.MessageRepository;

/**
 * Class contains message constants for JEAF Generator.
 *
 * @author JEAF Development Team
 * @version 1.3
 */
@MessageResource(path = "JEAFGeneratorMessages.xml")
public final class ErrorCodes {
  /**
   * Constant for XML file that contains all messages that are defined within this class.
   */
  private static final String MESSAGE_RESOURCE = "JEAFGeneratorMessages.xml";

  /**
   * Exceptions with this error code are thrown if the style sheet that defines the transformation of the XML document
   * containing error messages is not located within the applications class path.
   */
  public static final ErrorCode STYLESHEET_NOT_AVAILABLE;

  /**
   * Exceptions with this error code are thrown if the generator can not create an output directory for a generated
   * class.
   */
  public static final ErrorCode UNABLE_TO_CREATE_DIR;

  /**
   * Exceptions with this error code are thrown if an exception occurs during the generation of the Java class using
   * XSLT.
   */
  public static final ErrorCode UNABLE_TO_PERFORM_TRANSFORMATION;

  /**
   * Exceptions with this error code are thrown if an exception occurs during the generation of the Java class using
   * XSLT.
   */
  public static final ErrorCode INVALID_CLASS_INFO;

  /**
   * Exceptions with this error code are thrown when an exception occurs when trying to open an Excel workbook.
   */
  public static final ErrorCode UNABLE_TO_OPEN_EXCEL_WORKBOOK;

  /**
   * Exceptions with this error code are thrown when an exception occurs when trying to close an Excel workbook.
   */
  public static final ErrorCode UNABLE_TO_CLOSE_EXCEL_WORKBOOK;

  /**
   * Exceptions with this error code are thrown if class info is missing in the provided Excel workbook.
   */
  public static final ErrorCode CLASS_INFO_SHEET_MISSING;

  /**
   * Exceptions with this error code are thrown if a new XML document could not be created.
   */
  public static final ErrorCode UNABLE_TO_CREATE_XML_DOCUMENT;

  /**
   * Exceptions with this error code are thrown if a new XML document could not be created.
   */
  public static final ErrorCode NO_MESSAGE_DATA_IN_WORKBOOK;

  /**
   * Exceptions with this error code are thrown if a required column in message data is missing.
   */
  public static final ErrorCode INVALID_MESSAGE_DATA;

  /**
   * Exceptions with this error code are thrown if values for one or more required fields are missing.
   */
  public static final MessageID IGNORING_ROW;

  /**
   * Exceptions with this error code are thrown if a message ID is used multiple times.
   */
  public static final ErrorCode MESSAGE_ID_NOT_UNIQUE;

  /**
   * Exceptions with this error code are thrown if a message name is used multiple times.
   */
  public static final ErrorCode MESSAGE_NAME_NOT_UNIQUE;

  /**
   * Exceptions with this error code are thrown if a message name is used multiple times.
   */
  public static final MessageID IGNORING_EMPTY_SHEET;

  /**
   * JEAF Generator expects a specific version of the so called JEAF Meta Model (JMM). The JMM version that is used by
   * your UML model seems to be outdated. Please upgrade to latest version of JMM.
   */
  public static final ErrorCode INVALID_JMM;

  /**
   * When working with OpenAPI and REST there are some restrictions concerning the data types that can be used in Java.
   * This warning tells you that in a specific REST operation a incompatible parameter or return type is used. This will
   * lead to an invalid request / response from an OpenAPI perspective.
   */
  public static final ErrorCode INCOMPATIBLE_OPENAPI_TYPE;

  /**
   * Depending on how you export XMI files from your MagicDraw UML model, it might happen that the files contain
   * information about file systems paths. This should not be an issue on the machine where you exported the files.
   * However, it may lead to problems on other devices or your CI/CD infrastructure where file system paths might not be
   * the same.
   */
  public static final ErrorCode LOCAL_FILE_PATH_IN_XMI;

  /**
   * When working with OpenAPI and REST there are some restrictions concerning the data types that can be used in Java.
   * This warning tells you that in a defined «BeanParam» at least one property uses an incompatible type. This will
   * lead to an invalid request / response from an OpenAPI perspective.
   */
  public static final ErrorCode INCOMAPTIBLE_TYPE_IN_BEAN_PARAM;

  /**
   * When defining the path of a REST resource then the path that is defined on the «RESTResource» (not «RESTOperation»)
   * must start with a '/'
   */
  public static final ErrorCode INVALID_REST_RESOURCE_PATH;

  /**
   * The resource path of an «RESTOperation» is the combination of the path of the «RESTResource» and the
   * «RESTOperation». However at least one of them has to be defined.
   */
  public static final ErrorCode NO_REST_RESOURCE_PATH;

  /**
   * The path of a «RESTOperation» must not start with '/'.
   */
  public static final ErrorCode INVALID_REST_OPERSTION_PATH;

  /**
   * Each «RESTOperation» must define at least one HTTP method. If this message occurs then you have to fix your UML
   * model.
   */
  public static final ErrorCode NO_HTTP_METHOD_DEFINED;

  /**
   * The «RESTOperation» uses a HTTP status code that is not compatible with JAX-RS standard.
   */
  public static final ErrorCode INVALID_HTTP_STATUS_CODE;

  /**
   * The supported consumed media types can either be defined on the «RESTResource» or on the «RESTOperation» but at
   * least on one of them the information has to be defined.
   */
  public static final ErrorCode NO_CONSUMED_MEDIA_TYPE_DEFINED;

  /**
   * The produced media types can either be defined on the «RESTResource» or on the «RESTOperation» but at least on one
   * of them the information has to be defined.
   */
  public static final ErrorCode NO_PRODUCED_MEDIA_TYPE_DEFINED;

  /**
   * All input parameters of a «RESTOperation» must have a name. Please fix the issue in your UML model.
   */
  public static final ErrorCode REST_INPUT_PARAM_WITHOUT_NAME;

  /**
   * All input parameters that are not explicitly marked as «HeaderParam», «PathParam», «BeanParam» etc. are treated as
   * body. However REST only supports one body per request. So please ensure that there is not more than 1 body per
   * request.
   */
  public static final ErrorCode MULTIPLE_REQUEST_BODIES;

  /**
   * A «RESTOperation» defines a body parameter, however it's HTTP method does not allow to use a body.
   */
  public static final ErrorCode REQUEST_BODY_NOT_ALLOWED;

  /**
   * It's not allowed to have more than 1 global error response for an OpenAPI specification in an UML model.
   */
  public static final ErrorCode MORE_THAN_ONE_GLOBAL_ERROR_RESPONSE;

  /**
   * «OpenAPIResponse» types need to define exactly one response type
   */
  public static final ErrorCode TO_MANY_OPEN_API_RESPONSE_TYPES;

  /**
   * «OpenAPIDataType» must have 1 property as long as they are not modeled as composite data types.
   */
  public static final ErrorCode OPEN_API_DATA_TYPE_TOO_MANY_PROPERTIES;

  /**
   * «OpenAPIDataType» must only have primitive types of properties, as long as they are not modeled as composite data
   * types.
   */
  public static final ErrorCode OPEN_API_DATA_TYPE_ONLY_PRIMITIVES;

  /**
   * «OpenAPIDataType» must not have multi valued properties, as long as they are not modeled as composite data types.
   */
  public static final ErrorCode OPEN_API_DATA_TYPE_NO_MULTIVALUED_PROPERTIES;

  /**
   * «OpenAPIDataType» must not have parent classes.
   */
  public static final ErrorCode OPEN_API_DATA_TYPE_PARENT_NOT_SUPPORTED;

  /**
   * When defining a «PathParam» for a «RESTOperation» it is required that path parameters are required.
   */
  public static final ErrorCode PATH_PARAM_MUST_BE_REQUIRED;

  /**
   * «PathParam» must not be defined as multi valued in the UML model.
   */
  public static final ErrorCode PATH_PARAM_MUST_NOT_BE_MULTIVALUED;

  /**
   * It is strongly recommended that the elements of the UML model have a meaningful documentation ;-)
   */
  public static final ErrorCode DOCUMENTATION_MISSING;

  /**
   * When working with so called composite data types then inheritance is not supported for them.
   */
  public static final ErrorCode NO_PARENT_FOR_COMPOSITE_DATA_TYPES;

  /**
   * When modeling attributes in UML it is important that they also have a type. If a type is not defined then code
   * generation is not possible.
   */
  public static final ErrorCode ATTRIBUTE_WITHOUT_TYPE;

  /**
   * When modeling attributes and associations then it is required that they also have a type. If it is not defined then
   * code generation is not possible.
   */
  public static final ErrorCode PROPERTY_WITHOUT_NAME;

  /**
   * When modeling operations of services it is required that they also have a return type. Also case "void" has to be
   * defined in UML model. In addition multi valued primitive types are not supported as return types.
   */
  public static final ErrorCode INVALID_SERVICE_RETURN_TYPE;

  /**
   * When modeling parameters of operations it is required that they also have a name. If there are input parameters
   * without a name then code generation is not possible.
   */
  public static final ErrorCode INPUT_PARAMS_WITHOUT_NAME;

  /**
   * When modeling methods also a return type is required not only for methods that really return something but also in
   * case of "void". If a method does not define a return type then code generation is not possible.
   */
  public static final ErrorCode METHOD_WITHOUT_RETURN_TYPE;

  /**
   * When modeling method then they also have to have a name. Otherwise code generation is not possible.
   */
  public static final ErrorCode METHOD_WITHOUT_NAME;

  /**
   * All parameters within the UML model need to have a type. Otherwise code generation is not possible.
   */
  public static final ErrorCode PARAM_WITHOUT_TYPE;

  /**
   * When modeling activities you have to ensure that each «JEAFActivity» does not have more than one return parameter.
   */
  public static final ErrorCode ONLY_ONE_RETURN_PARAM_PER_ACTIVITY;

  /**
   * When modeling «JEAFComponents» you have to ensure that each component has defined a layer.
   */
  public static final ErrorCode NO_LAYER_DEFINED;

  /**
   * Class that are modeled as «PersistentObject» must have a so called "class id" with a value greater zero.
   */
  public static final ErrorCode NO_VALID_CLASS_ID;

  /**
   * When modeling persistent classes and their associations it is required that either both ends of an association have
   * applied stereotype «Role» or none of them.
   */
  public static final ErrorCode STEREOTYPE_ROLE_NOT_SET_ON_BOTH_ENDS;

  /**
   * When modeling associations between classes then it is required that navigable associations ends have set a role
   * name. Otherwise code generation is not possible.
   */
  public static final ErrorCode NO_ROLE_NAME_FOR_ASSOCIATION;

  /**
   * «ObjectMapping» is invalid according to the error message
   */
  public static final ErrorCode INVALID_OBJECT_MAPPING;

  /**
   * Minimum value for for Java Bean Validation «DecimalMin» is missing.
   */
  public static final ErrorCode DECIMAL_MIN_VALUE_MISSING;

  /**
   * For a specific Java Bean Validation a string-based or numeric target type is expected.
   */
  public static final ErrorCode WRONG_TARGET_TYPE_STRING_OR_NUMBER;

  /**
   * Maximum value for for Java Bean Validation «DecimalMax» is missing.
   */
  public static final ErrorCode DECIMAL_MAX_VALUE_MISSING;

  /**
   * For a specific Java Bean Validation a numeric target type is expected.
   */
  public static final ErrorCode WRONG_TARGET_TYPE_NUMBER;

  /**
   * When working with Java Bean Validation «Digit» then the integral and fractional digits have to be defined properly.
   */
  public static final ErrorCode WRONG_INTEGER_DIGITS;

  /**
   * When working with Java Bean Validation «Digit» then the integral and fractional digits have to be defined properly.
   */
  public static final ErrorCode WRONG_FRACTIONAL_DIGITS;

  /**
   * When working with Java Bean Validation «Size» then its minimal size has to be set properly.
   */
  public static final ErrorCode INVALID_SIZE_MIN;

  /**
   * When working with Java Bean Validation «Size» then its maximum size has to be set properly.
   */
  public static final ErrorCode INVALID_SIZE_MAX;

  /**
   * When working with Java Bean Validation «Size» maximum size has to be greater or equal to minimum size.
   */
  public static final ErrorCode INVALID_MAX_MIN_SIZE;

  /**
   * When working with Java Bean Validation «Size» then at least minimum or maximum size has to be set.
   */
  public static final ErrorCode EITHER_MIN_OR_MAX_HAS_TO_BE_SET;

  /**
   * For a specific Java Bean Validation a string, collection and map target type is expected.
   */
  public static final ErrorCode WRONG_TYPE_CHAR_OR_CONTAINER;

  /**
   * When working with Java Bean Validation «Pattern» then a regexp pattern has to be set.
   */
  public static final ErrorCode REGEXP_PATTERN_MISSING;

  /**
   * For a specific Java Bean Validation a string target type is expected.
   */
  public static final ErrorCode WRONG_TYPE_CHAR;

  /**
   * For a specific Java Bean Validation a boolean target type is expected.
   */
  public static final ErrorCode WRONG_TYPE_BOOLEAN;

  /**
   * For a specific Java Bean Validation a date target type is expected.
   */
  public static final ErrorCode WRONG_TYPE_DATE;

  /**
   * Special stereotype «Ignore» can be used to explicitly exclude model elements from code generation. However this
   * mechanism is intended to be a workaround / short term solution and not a permanent one ;-). Proper solution to this
   * is to clean up your UML model. That's why a warning is shown during code generation.
   */
  public static final ErrorCode IGNORED_ELEMENT;

  /**
   * OpenAPI standard defines that for whatever reason some header fields should not be mentioned in the OpenAPI
   * specification e.g. ''Authorization'' header. However from an overall perspective it still might make sense to
   * explicitly model them e.g. if these fields are still required in Java code. Putting it all together in very most
   * cases this warning can be ignored and is only generated to emphasis that these headers did not get "forgotten" in
   * generation of OpenAPI specification but are not added by intention. For further details please also refer to
   * https://github.com/OAI/OpenAPI-Specification/blob/main/versions/3.0.3.md#parameterObject
   */
  public static final ErrorCode IGNOREABLE_OPEN_API_HEADER_FOUND;

  /**
   * JEAF Generator supports to mark various elements in the UML model as deprecated. This information is also added to
   * the generated code and OpenAPI specification. However, there are cases where OpenAPI does not allow to mark an
   * element as deprecated. Namely this is the case for single valued references to other complex types like a 0..1
   * association to another object. In this case the generated Java code will still contain the deprecation but the
   * OpenAPI specification will not have "deprecation: true". Instead only as comment inside the file is created.
   *
   * Example: - # Property "xyz" is marked as deprecated. However OpenAPI does not support to mark references to complex
   * types as deprecated.
   */
  public static final ErrorCode DEPRECATION_MARKING_NOT_ALLOWED;

  /**
   * JAX-RS specification only allows to use java.util.List, java.util.Set or java.util.SortedSet for header params but
   * not java.util.Collection. Please fix your UML model so that either List, Set or SortedSet is used for multi valued
   * header fields.
   */
  public static final ErrorCode COLLECTION_HEADER_PARAM_NOT_SUPPORTED;

  /**
   * JAX-RS specification only allows to use java.util.List, java.util.Set or java.util.SortedSet for query params but
   * not java.util.Collection. Please fix your UML model so that either List, Set or SortedSet is used for multi valued
   * query params.
   */
  public static final ErrorCode COLLECTION_QUERY_PARAM_NOT_SUPPORTED;

  /**
   * JEAF Generator supports to also make the public representation of a composite data type visible internally. To do
   * so, a property has to be marked with stereotype «CompositeDataTypePublicField». In addition it is required that the
   * property is of type String.
   */
  public static final ErrorCode COMPOSITE_DATA_TYPE_PUBLIC_FIELD_MUST_BE_STRING;

  /**
   * JEAF Generator supports so called soft links. They can be used to modularize your model without loosing information
   * about real types. One possibility when using soft links is to use so called custom generic soft links. In this case
   * you can define your own type that should be used to represent the soft link association. This type, however has to
   * be configured in JEAF Generator Maven Plugin.
   */
  public static final ErrorCode CUSTOM_GENERIC_TYPE_NOT_CONFIGURED;

  /**
   * JEAF Generator supports so called OpenAPI Data Types. They can be used a strong type representation for basic
   * types. For OpenAPI Data Types it is strongly recommended that they are immutable.
   */
  public static final ErrorCode OPEN_API_DATA_TYPE_NOT_IMMUTABLE;

  /**
   * And model element can either be marked with stereotype «POJO» or «ServiceObject» but not both of them a the same
   * time.
   */
  public static final ErrorCode EITHER_POJO_OR_SERVICE_OBJECT;

  /**
   * If a model element is marked as deprecated also a description, a "since" flag and the planned removal date of the
   * deprecation should be provided so that consumers of the classes, services etc. can prepare.
   */
  public static final ErrorCode INCOMPLETE_DEPRECATION;

  /**
   * If a model element is marked as composite data type then a name for the public field representation is required to
   * be set in the model.
   */
  public static final ErrorCode NO_PUBLIC_FIELD_NAME_FOR_COMPOSITE_DATA_TYPE;

  /**
   * In case that a class has one or more non-transient bidirectional associations it is not possible to generate
   * equals() and hashCode() as it requires some business knowledge to do so. If equals() and hashCode() are required
   * for such a class then it has to be implemented manually.
   */
  public static final ErrorCode NO_EQUALS_FOR_BIDIRECTIONAL_ASSOCIATIONS;

  /**
   * JEAF Generator supports so called soft links. They can be used to modularize and decouple your application. Due to
   * that it does not make sense to use them in combination with bidirectional associations.
   */
  public static final ErrorCode SOFTLINK_FOR_BIDIRECTIONAL_ASSOCIATION_NOT_SUPPORTED;

  /**
   * A REST operation path defines one or more path params but not all of them are also present as parameters in the
   * defined REST operation
   */
  public static final ErrorCode PATH_PARAMS_MISSING;

  /**
   * A REST operation defines path parameters that are not defined on the operations paths as parameters
   */
  public static final ErrorCode DEAD_PATH_PARAMS;

  /**
   * JEAF Generator supports usage of so called Template Bindings in UML which are an equivalent to generics in Java. If
   * a class makes usage of such a template binding then also a parameter substitution has to be defined in the UML
   * model.
   */
  public static final ErrorCode INVALID_TEMPLATE_BINDING_NO_SUBST;

  /**
   * JEAF Generator supports usage of so called Template Bindings in UML which are an equivalent to generics in Java.
   * However in UML it is possible to define more than one template binding per class. This is currently not supported
   * by JEAF Generator.
   */
  public static final ErrorCode TOO_MANY_TEMPLATE_BINDINGS;

  /**
   * Enumerations might have mandatory properties without default values. If an enumeration literal is defined in the
   * UML model and not all mandatory properties without default value are set, then this error message will be used.
   */
  public static final ErrorCode MANDATORY_ENUM_PROPERTIES_NOT_SET;

  /**
   * Names of classes, enumerations, properties, parameters and operations must match to regular expression according to
   * Java Language Specification.
   */
  public static final ErrorCode INVALID_IDENTIFIER_NAME;

  /**
   * JEAF Generator supports to split a model into several OpenAPI specifications. If in such a case one OpenAPI
   * specification refers to the types of another one then a dependency between OpenAPI specs has to be defined in the
   * model.
   */
  public static final ErrorCode OPEN_API_SPEC_REFERENCE_MISSING;

  /**
   * When working with OpenAPI specifications then all complex types that are used must belong either to the same or
   * another OpenAPI specification. Please make sure that OpenAPI types only use basic types or other OpenAPI types that
   * belong to an OpenAPI specification (same or referenced one).
   */
  public static final ErrorCode ORPHANED_OPEN_API_TYPE_USED;
  /**
   * Static initializer contains initialization for all generated constants.
   */
  static {
    MessageRepository lRepository = XFun.getMessageRepository();
    lRepository.loadResource(MESSAGE_RESOURCE);
    // Handle all info messages.
    IGNORING_ROW = lRepository.getMessageID(9010);
    IGNORING_EMPTY_SHEET = lRepository.getMessageID(9013);
    // Handle all messages for errors.
    STYLESHEET_NOT_AVAILABLE = lRepository.getErrorCode(9000);
    UNABLE_TO_CREATE_DIR = lRepository.getErrorCode(9001);
    UNABLE_TO_PERFORM_TRANSFORMATION = lRepository.getErrorCode(9002);
    INVALID_CLASS_INFO = lRepository.getErrorCode(9003);
    UNABLE_TO_OPEN_EXCEL_WORKBOOK = lRepository.getErrorCode(9004);
    UNABLE_TO_CLOSE_EXCEL_WORKBOOK = lRepository.getErrorCode(9005);
    CLASS_INFO_SHEET_MISSING = lRepository.getErrorCode(9006);
    UNABLE_TO_CREATE_XML_DOCUMENT = lRepository.getErrorCode(9007);
    NO_MESSAGE_DATA_IN_WORKBOOK = lRepository.getErrorCode(9008);
    INVALID_MESSAGE_DATA = lRepository.getErrorCode(9009);
    MESSAGE_ID_NOT_UNIQUE = lRepository.getErrorCode(9011);
    MESSAGE_NAME_NOT_UNIQUE = lRepository.getErrorCode(9012);
    INVALID_JMM = lRepository.getErrorCode(9100);
    INCOMPATIBLE_OPENAPI_TYPE = lRepository.getErrorCode(9101);
    LOCAL_FILE_PATH_IN_XMI = lRepository.getErrorCode(9102);
    INCOMAPTIBLE_TYPE_IN_BEAN_PARAM = lRepository.getErrorCode(9103);
    INVALID_REST_RESOURCE_PATH = lRepository.getErrorCode(9104);
    NO_REST_RESOURCE_PATH = lRepository.getErrorCode(9105);
    INVALID_REST_OPERSTION_PATH = lRepository.getErrorCode(9106);
    NO_HTTP_METHOD_DEFINED = lRepository.getErrorCode(9107);
    INVALID_HTTP_STATUS_CODE = lRepository.getErrorCode(9108);
    NO_CONSUMED_MEDIA_TYPE_DEFINED = lRepository.getErrorCode(9109);
    NO_PRODUCED_MEDIA_TYPE_DEFINED = lRepository.getErrorCode(9110);
    REST_INPUT_PARAM_WITHOUT_NAME = lRepository.getErrorCode(9111);
    MULTIPLE_REQUEST_BODIES = lRepository.getErrorCode(9112);
    REQUEST_BODY_NOT_ALLOWED = lRepository.getErrorCode(9113);
    MORE_THAN_ONE_GLOBAL_ERROR_RESPONSE = lRepository.getErrorCode(9114);
    TO_MANY_OPEN_API_RESPONSE_TYPES = lRepository.getErrorCode(9115);
    OPEN_API_DATA_TYPE_TOO_MANY_PROPERTIES = lRepository.getErrorCode(9116);
    OPEN_API_DATA_TYPE_ONLY_PRIMITIVES = lRepository.getErrorCode(9117);
    OPEN_API_DATA_TYPE_NO_MULTIVALUED_PROPERTIES = lRepository.getErrorCode(9118);
    OPEN_API_DATA_TYPE_PARENT_NOT_SUPPORTED = lRepository.getErrorCode(9119);
    PATH_PARAM_MUST_BE_REQUIRED = lRepository.getErrorCode(9120);
    PATH_PARAM_MUST_NOT_BE_MULTIVALUED = lRepository.getErrorCode(9121);
    DOCUMENTATION_MISSING = lRepository.getErrorCode(9122);
    NO_PARENT_FOR_COMPOSITE_DATA_TYPES = lRepository.getErrorCode(9123);
    ATTRIBUTE_WITHOUT_TYPE = lRepository.getErrorCode(9124);
    PROPERTY_WITHOUT_NAME = lRepository.getErrorCode(9125);
    INVALID_SERVICE_RETURN_TYPE = lRepository.getErrorCode(9126);
    INPUT_PARAMS_WITHOUT_NAME = lRepository.getErrorCode(9127);
    METHOD_WITHOUT_RETURN_TYPE = lRepository.getErrorCode(9128);
    METHOD_WITHOUT_NAME = lRepository.getErrorCode(9129);
    PARAM_WITHOUT_TYPE = lRepository.getErrorCode(9130);
    ONLY_ONE_RETURN_PARAM_PER_ACTIVITY = lRepository.getErrorCode(9131);
    NO_LAYER_DEFINED = lRepository.getErrorCode(9132);
    NO_VALID_CLASS_ID = lRepository.getErrorCode(9133);
    STEREOTYPE_ROLE_NOT_SET_ON_BOTH_ENDS = lRepository.getErrorCode(9134);
    NO_ROLE_NAME_FOR_ASSOCIATION = lRepository.getErrorCode(9135);
    INVALID_OBJECT_MAPPING = lRepository.getErrorCode(9136);
    DECIMAL_MIN_VALUE_MISSING = lRepository.getErrorCode(9137);
    WRONG_TARGET_TYPE_STRING_OR_NUMBER = lRepository.getErrorCode(9138);
    DECIMAL_MAX_VALUE_MISSING = lRepository.getErrorCode(9139);
    WRONG_TARGET_TYPE_NUMBER = lRepository.getErrorCode(9140);
    WRONG_INTEGER_DIGITS = lRepository.getErrorCode(9141);
    WRONG_FRACTIONAL_DIGITS = lRepository.getErrorCode(9142);
    INVALID_SIZE_MIN = lRepository.getErrorCode(9143);
    INVALID_SIZE_MAX = lRepository.getErrorCode(9144);
    INVALID_MAX_MIN_SIZE = lRepository.getErrorCode(9145);
    EITHER_MIN_OR_MAX_HAS_TO_BE_SET = lRepository.getErrorCode(9146);
    WRONG_TYPE_CHAR_OR_CONTAINER = lRepository.getErrorCode(9147);
    REGEXP_PATTERN_MISSING = lRepository.getErrorCode(9148);
    WRONG_TYPE_CHAR = lRepository.getErrorCode(9149);
    WRONG_TYPE_BOOLEAN = lRepository.getErrorCode(9150);
    WRONG_TYPE_DATE = lRepository.getErrorCode(9151);
    IGNORED_ELEMENT = lRepository.getErrorCode(9152);
    IGNOREABLE_OPEN_API_HEADER_FOUND = lRepository.getErrorCode(9153);
    DEPRECATION_MARKING_NOT_ALLOWED = lRepository.getErrorCode(9154);
    COLLECTION_HEADER_PARAM_NOT_SUPPORTED = lRepository.getErrorCode(9155);
    COLLECTION_QUERY_PARAM_NOT_SUPPORTED = lRepository.getErrorCode(9156);
    COMPOSITE_DATA_TYPE_PUBLIC_FIELD_MUST_BE_STRING = lRepository.getErrorCode(9157);
    CUSTOM_GENERIC_TYPE_NOT_CONFIGURED = lRepository.getErrorCode(9158);
    OPEN_API_DATA_TYPE_NOT_IMMUTABLE = lRepository.getErrorCode(9159);
    EITHER_POJO_OR_SERVICE_OBJECT = lRepository.getErrorCode(9160);
    INCOMPLETE_DEPRECATION = lRepository.getErrorCode(9161);
    NO_PUBLIC_FIELD_NAME_FOR_COMPOSITE_DATA_TYPE = lRepository.getErrorCode(9162);
    NO_EQUALS_FOR_BIDIRECTIONAL_ASSOCIATIONS = lRepository.getErrorCode(9163);
    SOFTLINK_FOR_BIDIRECTIONAL_ASSOCIATION_NOT_SUPPORTED = lRepository.getErrorCode(9164);
    PATH_PARAMS_MISSING = lRepository.getErrorCode(9165);
    DEAD_PATH_PARAMS = lRepository.getErrorCode(9166);
    INVALID_TEMPLATE_BINDING_NO_SUBST = lRepository.getErrorCode(9167);
    TOO_MANY_TEMPLATE_BINDINGS = lRepository.getErrorCode(9168);
    MANDATORY_ENUM_PROPERTIES_NOT_SET = lRepository.getErrorCode(9169);
    INVALID_IDENTIFIER_NAME = lRepository.getErrorCode(9170);
    OPEN_API_SPEC_REFERENCE_MISSING = lRepository.getErrorCode(9171);
    ORPHANED_OPEN_API_TYPE_USED = lRepository.getErrorCode(9172);
    // Handle all localized strings.
  }

  /**
   * Constructor is private to ensure that no instances of this class will be created.
   */
  private ErrorCodes( ) {
    // Nothing to do.
  }
}