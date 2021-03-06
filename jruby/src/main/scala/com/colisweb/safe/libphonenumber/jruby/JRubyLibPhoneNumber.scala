package com.colisweb.safe.libphonenumber.jruby

import com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber
import com.guizmaii.safe.libphonenumber.core.{Country, LibPhoneNumber}

object JRubyCountry {
  final val france: Country = Country.France
}

object JRubyLibPhoneNumber {

  final def parse(phoneNumner: String, country: Country): PhoneNumber =
    LibPhoneNumber.parse(phoneNumner, country).getOrElse(null)

  final def format(phoneNumber: PhoneNumber, numberFormat: PhoneNumberFormat): String =
    LibPhoneNumber.format(phoneNumber, numberFormat).getOrElse(null)

  final def parseAndFormat(
    phoneNumber: String,
    country: Country,
    numberFormat: PhoneNumberFormat
  ): String = LibPhoneNumber.parseAndFormat(phoneNumber, country, numberFormat).getOrElse(null)

  final def isPossibleNumber(phoneNumber: String, country: Country): Boolean =
    LibPhoneNumber.isPossibleNumber(phoneNumber, country)

}
