# coding: utf-8

"""
    MDES for Merchants

    The MDES APIs are designed as RPC style stateless web services where each API endpoint represents an operation to be performed.  All request and response payloads are sent in the JSON (JavaScript Object Notation) data-interchange format. Each endpoint in the API specifies the HTTP Method used to access it. All strings in request and response objects are to be UTF-8 encoded.  Each API URI includes the major and minor version of API that it conforms to.  This will allow multiple concurrent versions of the API to be deployed simultaneously. <br> __Authentication__ Mastercard uses OAuth 1.0a with body hash extension for authenticating the API clients. This requires every request that you send to  Mastercard to be signed with an RSA private key. A private-public RSA key pair must be generated consisting of: <br> 1 . A private key for the OAuth signature for API requests. It is recommended to keep the private key in a password-protected or hardware keystore. <br> 2. A public key is shared with Mastercard during the project setup process through either a certificate signing request (CSR) or the API Key Generator. Mastercard will use the public key to verify the OAuth signature that is provided on every API call.<br>  An OAUTH1.0a signer library is available on [GitHub](https://github.com/Mastercard/oauth1-signer-java) <br>  __Encryption__<br>  All communications between Issuer web service and the Mastercard gateway is encrypted using TLS. <br> __Additional Encryption of Sensitive Data__ In addition to the OAuth authentication, when using MDES Digital Enablement Service, any PCI sensitive and all account holder Personally Identifiable Information (PII) data must be encrypted. This requirement applies to the API fields containing encryptedData. Sensitive data is encrypted using a symmetric session (one-time-use) key. The symmetric session key is then wrapped with an RSA Public Key supplied by Mastercard during API setup phase (the Customer Encryption Key). <br>  Java Client Encryption Library available on [GitHub](https://github.com/Mastercard/client-encryption-java)   # noqa: E501

    OpenAPI spec version: 1.2.8
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six

from swagger_client.models.billing_address import BillingAddress  # noqa: F401,E501
from swagger_client.models.phone_number import PhoneNumber  # noqa: F401,E501


class AccountHolderData(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'account_holder_name': 'str',
        'account_holder_address': 'BillingAddress',
        'consumer_identifier': 'str',
        'account_holder_email_address': 'str',
        'account_holder_mobile_phone_number': 'PhoneNumber'
    }

    attribute_map = {
        'account_holder_name': 'accountHolderName',
        'account_holder_address': 'accountHolderAddress',
        'consumer_identifier': 'consumerIdentifier',
        'account_holder_email_address': 'accountHolderEmailAddress',
        'account_holder_mobile_phone_number': 'accountHolderMobilePhoneNumber'
    }

    def __init__(self, account_holder_name=None, account_holder_address=None, consumer_identifier=None, account_holder_email_address=None, account_holder_mobile_phone_number=None):  # noqa: E501
        """AccountHolderData - a model defined in Swagger"""  # noqa: E501

        self._account_holder_name = None
        self._account_holder_address = None
        self._consumer_identifier = None
        self._account_holder_email_address = None
        self._account_holder_mobile_phone_number = None
        self.discriminator = None

        if account_holder_name is not None:
            self.account_holder_name = account_holder_name
        if account_holder_address is not None:
            self.account_holder_address = account_holder_address
        if consumer_identifier is not None:
            self.consumer_identifier = consumer_identifier
        if account_holder_email_address is not None:
            self.account_holder_email_address = account_holder_email_address
        if account_holder_mobile_phone_number is not None:
            self.account_holder_mobile_phone_number = account_holder_mobile_phone_number

    @property
    def account_holder_name(self):
        """Gets the account_holder_name of this AccountHolderData.  # noqa: E501

        __(OPTIONAL)__ The name of the cardholder<br> __Max Length:27__   # noqa: E501

        :return: The account_holder_name of this AccountHolderData.  # noqa: E501
        :rtype: str
        """
        return self._account_holder_name

    @account_holder_name.setter
    def account_holder_name(self, account_holder_name):
        """Sets the account_holder_name of this AccountHolderData.

        __(OPTIONAL)__ The name of the cardholder<br> __Max Length:27__   # noqa: E501

        :param account_holder_name: The account_holder_name of this AccountHolderData.  # noqa: E501
        :type: str
        """

        self._account_holder_name = account_holder_name

    @property
    def account_holder_address(self):
        """Gets the account_holder_address of this AccountHolderData.  # noqa: E501


        :return: The account_holder_address of this AccountHolderData.  # noqa: E501
        :rtype: BillingAddress
        """
        return self._account_holder_address

    @account_holder_address.setter
    def account_holder_address(self, account_holder_address):
        """Sets the account_holder_address of this AccountHolderData.


        :param account_holder_address: The account_holder_address of this AccountHolderData.  # noqa: E501
        :type: BillingAddress
        """

        self._account_holder_address = account_holder_address

    @property
    def consumer_identifier(self):
        """Gets the consumer_identifier of this AccountHolderData.  # noqa: E501

        __(OPTIONAL)__ Customer Identifier that may be required in some regions.<br> __Max Length:88__   # noqa: E501

        :return: The consumer_identifier of this AccountHolderData.  # noqa: E501
        :rtype: str
        """
        return self._consumer_identifier

    @consumer_identifier.setter
    def consumer_identifier(self, consumer_identifier):
        """Sets the consumer_identifier of this AccountHolderData.

        __(OPTIONAL)__ Customer Identifier that may be required in some regions.<br> __Max Length:88__   # noqa: E501

        :param consumer_identifier: The consumer_identifier of this AccountHolderData.  # noqa: E501
        :type: str
        """

        self._consumer_identifier = consumer_identifier

    @property
    def account_holder_email_address(self):
        """Gets the account_holder_email_address of this AccountHolderData.  # noqa: E501

        __(OPTIONAL)__ The e-mail address of the Account Holder<br> __Max Length: 320__   # noqa: E501

        :return: The account_holder_email_address of this AccountHolderData.  # noqa: E501
        :rtype: str
        """
        return self._account_holder_email_address

    @account_holder_email_address.setter
    def account_holder_email_address(self, account_holder_email_address):
        """Sets the account_holder_email_address of this AccountHolderData.

        __(OPTIONAL)__ The e-mail address of the Account Holder<br> __Max Length: 320__   # noqa: E501

        :param account_holder_email_address: The account_holder_email_address of this AccountHolderData.  # noqa: E501
        :type: str
        """

        self._account_holder_email_address = account_holder_email_address

    @property
    def account_holder_mobile_phone_number(self):
        """Gets the account_holder_mobile_phone_number of this AccountHolderData.  # noqa: E501

        __(OPTIONAL)__ The mobile phone number of the account holder.   # noqa: E501

        :return: The account_holder_mobile_phone_number of this AccountHolderData.  # noqa: E501
        :rtype: PhoneNumber
        """
        return self._account_holder_mobile_phone_number

    @account_holder_mobile_phone_number.setter
    def account_holder_mobile_phone_number(self, account_holder_mobile_phone_number):
        """Sets the account_holder_mobile_phone_number of this AccountHolderData.

        __(OPTIONAL)__ The mobile phone number of the account holder.   # noqa: E501

        :param account_holder_mobile_phone_number: The account_holder_mobile_phone_number of this AccountHolderData.  # noqa: E501
        :type: PhoneNumber
        """

        self._account_holder_mobile_phone_number = account_holder_mobile_phone_number

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value
        if issubclass(AccountHolderData, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, AccountHolderData):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other