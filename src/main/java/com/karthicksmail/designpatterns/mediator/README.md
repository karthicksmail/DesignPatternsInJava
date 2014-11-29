Mediator Pattern

	* Used when complex calling relationship between classes.

Example where this is required:

This becomes the following once the pattern is applied:

Code Snippet:
Consider a use case where the following scenarios need to happen:
<table>
	<tr>
		<th>User Input</th>
		<th>Handler Sequence</th>
	</tr>
	<tr>
		<td>1</td>
		<td>H1 &#8658; H2 &#8658; H3</td>
	</tr>
	<tr>
		<td>2</td>
		<td>H2 &#8658; H4 &#8658; H3 &#8658; H6</td>
	</tr>
	<tr>
		<td>3</td>
		<td>H1 &#8658; H5 &#8658; H2</td>
	</tr>
	<tr>
		<td>4</td>
		<td>H1 &#8658; (if value < 0) { H8 &#8658; H2 } else { H6 &#8658; H3 &#8658; H7 } &#8658; H4 </td>
	</tr>
</table>

