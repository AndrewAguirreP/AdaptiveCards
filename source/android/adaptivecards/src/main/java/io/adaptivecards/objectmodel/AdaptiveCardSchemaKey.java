/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public enum AdaptiveCardSchemaKey {
  Accent(0),
  ActionAlignment,
  ActionMode,
  ActionOrientation,
  Actions,
  ActionSetConfig,
  ActionsOrientation,
  AdaptiveCard,
  AllowCustomStyle,
  AltText,
  Attention,
  BackgroundColor,
  BackgroundImage,
  BackgroundImageUrl,
  BaseCardElement,
  Body,
  Bolder,
  BorderColor,
  BorderThickness,
  Bottom,
  ButtonSpacing,
  Card,
  Center,
  Choices,
  ChoiceSet,
  Color,
  ColorConfig,
  ForegroundColors,
  Column,
  Columns,
  ColumnSet,
  Container,
  ContainerStyles,
  Dark,
  Data,
  DateInput,
  Default,
  Emphasis,
  ExtraLarge,
  Facts,
  FactSet,
  FallbackText,
  FontFamily,
  FontSizes,
  FontWeights,
  Good,
  Height,
  HorizontalAlignment,
  IconPlacement,
  IconUrl,
  Id,
  Image,
  ImageBaseUrl,
  Images,
  ImageSet,
  ImageSize,
  ImageSizes,
  InlineTopMargin,
  IsMultiline,
  IsMultiSelect,
  IsRequired,
  IsSelected,
  IsSubtle,
  Items,
  Language,
  Large,
  Left,
  Light,
  Lighter,
  LineColor,
  LineThickness,
  Max,
  MaxActions,
  MaxImageHeight,
  MaxLength,
  MaxLines,
  MaxWidth,
  Medium,
  Method,
  Min,
  NumberInput,
  Padding,
  Placeholder,
  Right,
  SelectAction,
  Separator,
  ShowActionMode,
  ShowCard,
  ShowCardActionConfig,
  Size,
  Small,
  Spacing,
  SpacingDefinition,
  Speak,
  Stretch,
  Style,
  Subtle,
  SupportsInteractivity,
  Text,
  TextBlock,
  TextConfig,
  TextInput,
  TextWeight,
  Thick,
  Thickness,
  TimeInput,
  Title,
  ToggleInput,
  Top,
  Type,
  Url,
  Value,
  ValueOff,
  ValueOn,
  Version,
  VerticalContentAlignment,
  Warning,
  Weight,
  Width,
  Wrap;

  public final int swigValue() {
    return swigValue;
  }

  public static AdaptiveCardSchemaKey swigToEnum(int swigValue) {
    AdaptiveCardSchemaKey[] swigValues = AdaptiveCardSchemaKey.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (AdaptiveCardSchemaKey swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + AdaptiveCardSchemaKey.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private AdaptiveCardSchemaKey() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private AdaptiveCardSchemaKey(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private AdaptiveCardSchemaKey(AdaptiveCardSchemaKey swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

