package com.guizmaii.safe.libphonenumber

import com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat
import org.scalatest.{FlatSpec, Matchers}

class LibPhoneNumberTest extends FlatSpec with Matchers {

  behavior of "LibPhoneNumberTest"

  it should "format" in {}

  it should "parse" in {}

  it should "parseAndFormat" in {
    LibPhoneNumber.parseAndFormat("3369678876", France, PhoneNumberFormat.E164) shouldBe Right("+3369678876")
  }

}
