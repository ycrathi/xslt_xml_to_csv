<?xml version="1.0"?>
<xsl:stylesheet version="1.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="text" encoding="utf-8"/>

    <xsl:template match="/">
        <xsl:text>title,artist&#xa;</xsl:text>
        <xsl:for-each select="catalog/cd">
            <xsl:value-of select="title"/>,<xsl:value-of select="artist"/>
            <xsl:text>&#xa;</xsl:text>
        </xsl:for-each>
    </xsl:template>
</xsl:stylesheet>