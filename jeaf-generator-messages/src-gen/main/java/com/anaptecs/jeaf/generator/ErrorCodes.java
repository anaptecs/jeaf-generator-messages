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
   * your UML Model seems to be outdated. Please upgrade to latest version of JMM.
   */
  public static final ErrorCode INVALID_JMM;

  /**
   * When working with OpenAPI and REST there are some restrictions concerning the data types that can be used in Java.
   * This warning tells you that in a specific REST operation a incompatible parameter or return type is used. This will
   * lead to an invalid request / response from an OpenAPI perspective.
   */
  public static final ErrorCode INCOMPATIBLE_OPENAPI_TYPE;

  /**
   * Depending on how you export XMI files from your MagicDraw model it might happen that the files contain information
   * about file systems paths. This should not be an issue on the machine where you exported the files. However, it may
   * lead to problems on other devices or your CI/CD infrastructure where file system paths might not be the same.
   */
  public static final ErrorCode LOCAL_FILE_PATH_IN_XMI;

  /**
   * When working with OpenAPI and REST there are some restrictions concerning the data types that can be used in Java.
   * This warning tells you that in a defined "BeanParam" at least one property uses an incompatible type. This will
   * lead to an invalid request / response from an OpenAPI perspective.
   */
  public static final ErrorCode INCOMAPTIBLE_TYPE_IN_BEAN_PARAM;

  /**
   * When defining the path of a REST resource then the path that is defined on the RESTResource (not RESTOperation)
   * must start with a '/'
   */
  public static final ErrorCode INVALID_REST_RESOURCE_PATH;

  /**
   * The resource path of an "RESTOperation" is the combination of the path of the "RESTResource" and the
   * "RESTOperation". However at least one of them has to be defined.
   */
  public static final ErrorCode NO_REST_RESOURCE_PATH;

  /**
   * The path of a "RESTOperation" must not start with '/'.
   */
  public static final ErrorCode INVALID_REST_OPERSTION_PATH;

  /**
   * Each "RESTOperation" must define at least one HTTP method. If this message occurs then you have to fix your UML
   * Model.
   */
  public static final ErrorCode NO_HTTP_METHOD_DEFINED;

  /**
   * The "RESTOperation" uses a HTTP status code that is not compatible with JAX-RS standard.
   */
  public static final ErrorCode INVALID_HTTP_STATUS_CODE;

  /**
   * The supported consumed media types can either be defined on the "RESTResource" or on the "RESTOperation" but at
   * least on one of them the information has to be defined.
   */
  public static final ErrorCode NO_CONSUMED_MEDIA_TYPE_DEFINED;

  /**
   * The produced media types can either be defined on the "RESTResource" or on the "RESTOperation" but at least on one
   * of them the information has to be defined.
   */
  public static final ErrorCode NO_PRODUCED_MEDIA_TYPE_DEFINED;

  /**
   * All input paramaters of a "RESTOperation" have to have a name. Please fix the issue in your UML model.
   */
  public static final ErrorCode REST_INPUT_PARAM_WITHOUT_NAME;

  /**
   * All input paramaters that are not explicitly marked as "HeaderParam", "PathParam", "BeanParam" etc. are treated as
   * body. However REST only supports one body per request. So please ensure that there is not more than 1 body per
   * request.
   */
  public static final ErrorCode MULTIPLE_REQUEST_BODIES;

  /**
   * A "RESTOperation" defines a body paramater, however it's HTTP method does not allow to use a body.
   */
  public static final ErrorCode REQUEST_BODY_NOT_ALLOWED;

  /**
   * It's not allowed to have more than 1 global error reponse for an OpenAPI specification in an UML Model.
   */
  public static final ErrorCode MORE_THAN_ONE_GLOBAL_ERROR_RESPONSE;

  /**
   * "OpenAPIResponse" types need to define exactly one response type
   */
  public static final ErrorCode TO_MANY_OPEN_API_RESPONSE_TYPES;

  /**
   * "OpenAPIDataType" must have 1 property as long as they are not modeled as composite data types.
   */
  public static final ErrorCode OPEN_API_DATA_TYPE_TOO_MANY_PROPERTIES;

  /**
   * "OpenAPIDataType" must only have primitive types of properties, as long as they are not modeled as composite data
   * types.
   */
  public static final ErrorCode OPEN_API_DATA_TYPE_ONLY_PRIMITIVES;

  /**
   * "OpenAPIDataType" must not have multivalued properties, as long as they are not modeled as composite data types.
   */
  public static final ErrorCode OPEN_API_DATA_TYPE_NO_MULTIVALUED_PROPERTIES;

  /**
   * "OpenAPIDataType" must not have parent classes.
   */
  public static final ErrorCode OPEN_API_DATA_TYPE_PARENT_NOT_SUPPORTED;

  /**
   * When defining a path param for a "RESTOperation" it is required that path paramaters are required.
   */
  public static final ErrorCode PATH_PARAM_MUST_BE_REQUIRED;

  /**
   * "PathParam" must not be defined as multivalued in the UML Model.
   */
  public static final ErrorCode PATH_PARAM_MUST_NOT_BE_MULTIVALUED;

  /**
   * It is strongly recommended that the elements of the UML model have a meaningful documentation ;-)
   */
  public static final ErrorCode DOCUMENTATION_MISSING;

  /**
   * When working with so called composite data types then inherhitance is not suppported for them.
   */
  public static final ErrorCode NO_PARENT_FOR_COMPOSITE_DATA_TYPES;

  /**
   * When modelling attributes in UML it is important that they also have a type. If a type is not defined then code
   * generation is not possible.
   */
  public static final ErrorCode ATTRIBUTE_WITHOUT_TYPE;

  /**
   * When modelling attributes and associations then it is reuiqred that they also have a type. If it is not defined
   * then code generation is not possible.
   */
  public static final ErrorCode PROPERTY_WITHOUT_NAME;

  /**
   * When modelling operations of services it is required that they also have a return type. Also case "void" has to be
   * defined in UML Model. In addition multivalued primitive types are not supported as return types.
   */
  public static final ErrorCode INVALID_SERVICE_RETURN_TYPE;

  /**
   * When modelling parameters of operations it is reuiqred that they also have a name. If there are input parameters
   * without a name then code generation is not possible.
   */
  public static final ErrorCode INPUT_PARAMS_WITHOUT_NAME;
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
    // Handle all localized strings.
  }

  /**
   * Constructor is private to ensure that no instances of this class will be created.
   */
  private ErrorCodes( ) {
    // Nothing to do.
  }
}